import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int n = 16777214;
        Test test = new Test(); 
        int[] result = test.primesum(n);
        System.out.println(Arrays.toString(result));
    }

    public int[] primesum(int n) {
        int[] primes = getAllPrimes(n);
        int i=0, j=primes.length-1;
        while(i<j) {
            int sum = primes[i] + primes[j];
            if(sum == n) {
                return new int[]{primes[i], primes[j]};
            } else if(sum < n) {
                i++;
            } else {
                j--;
            }
        }
        for(int ik=0; ik<primes.length; ik++){
            if(primes[ik] * 2 == n){
                return new int[]{primes[ik], primes[ik] };
            }
        }
        return new int[]{-1};
    }

    private int[] getAllPrimes(int n) {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        if(n>1){
            prime[0] = false;
            prime[1] = false;
            int k=0;
            for (int i = 2; i * i <= n; i++) {
                if (prime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        prime[j] = false;
                    }
                }
            }
            List<Integer> list = new ArrayList<>();
            for(int iv=0; iv<prime.length; iv++) {
                if(prime[iv]) {
                    list.add(iv);
                }
            }
            int[] result = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
        return new int[]{-1};
        
    }
}
