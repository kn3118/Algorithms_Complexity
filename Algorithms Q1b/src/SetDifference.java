import java.util.ArrayList;

public class SetDifference {

  public static int[] Difference(int A[], int B[]) {
    int C[] = new int[A.length];
    int count = 0;
    int j = 0;
    int M = A.length;
    int N = B.length;

    for (int i = 0; i < M; i++) {
      while (j < N && A[i] > B[j]) {
        j++;
      }
      if (j >= N) {
        for (int m = i; m < M; m++) {
          C[count] = A[m];
          count++;
        }
        return C;
      }
      if (A[i] < B[j]) {
        C[count] = A[i];
        count++;
      }
      if (A[i] == B[j]) {
        j++;
      }
    }
    return C;
  }

  public static int LONGEST(int A[]) {
    int N = A.length;
    int L[] = new int[N];
    for (int i = 0; i < N; i++) {
      L[i] = 1;
    }
    for (int i = 1; i < N; i++) {
      for (int j = 0; j < i; j++) {
        if (A[i] > A[j] && L[i] < L[j] + 1) {
          L[i] = L[j] + 1;
        }
      }
    }
    int max = 0;
    for (int count = 0; count < N; count++) {
      if (max < L[count]) {
        max = L[count];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int A[] = {5, 3, 4, 7, 6, 2, 3, 7, 10};
//    int B[] = {1, 2, 4, 3, 5};
//    int C[] = Difference(A, B);
//    for (int i = 0; i < C.length; i++) {
//      System.out.println(C[i]);
//    }
    int length = LONGEST(A);
    System.out.println(length);
  }
}
