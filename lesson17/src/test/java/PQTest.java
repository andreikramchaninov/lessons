import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Comparator;


public class PQTest {
  @Test
  public void test1() {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.insert(10);
    pq.insert(30);
    pq.insert(20);

    assertThat(pq.max(), is(30));
    assertThat(pq.max(), is(20));
    assertThat(pq.max(), is(10));
  }

  class WeirdIntegerComparator<T> implements Comparator<T> {
    public int compare(T left, T right) {
      return Integer.compare(left, right);
    }
  }

  class PriorityQueue<T extends Comparable> {
    private Object[] elements = new Object[16];
    int size = 0;
    private Comparator<T> comparator;

    PriorityQueue() {
      //Arrays.fill(elements, 0);
    }

    PriorityQueue(Comparator<T> comparator) {
      this.comparator = comparator;
    }

    void insert(Integer item) {
      if (elements.length == size) {
        elements = Arrays.copyOf(elements, elements.length * 2);
      }
      elements[++size] = item;

      swim(size);
    }

    Integer max() {
      Integer max = elements[1];
      elements[1] = elements[size];
      elements[size] = null;
      size--;
      sink(1);
      return max;
    }

    private void exchange(int n, int m) {
      Integer temp = elements[n];
      elements[n] = elements[m];
      elements[m] = temp;
    }

    private boolean lessOrEqual(int n, int m) {
      return elements[n] <= elements[m];
    }

    private boolean isRoot(int k) {
      return k == 1;
    }

    private int getParentIndex(int k) {
      return k / 2;
    }

    private void swim(int k) {
      //to move up parent = k / 2
      while (isRoot(k) && lessOrEqual(k, getParentIndex(k))) {
        exchange(k, getParentIndex(k));
        k = getParentIndex(k);
      }
    }

    private void sink(int k) {
      // k * 2 = left
      // k * 2 + 1 = right
      while (getLeftChildIndex(k) <= size) {
        int childOfK = getLeftChildIndex(k);
        if (childOfK != size && lessOrEqual(childOfK, childOfK + 1)) {
          childOfK++;
        }
        if (lessOrEqual(k, childOfK)) {
          k = childOfK;
        } else {
          break;
        }
      }
    }

    private int getLeftChildIndex(int k) {
      return k * 2;
    }
  }
}
