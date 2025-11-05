public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] recaman(int n) {
    if (n <= 0) return new int[0];
    if (n == 1) return new int[]{1};

    int[] prev = recaman(n - 1);

    java.util.HashSet<Integer> seen = new java.util.HashSet<>();
    seen.add(0);
    for (int v : prev) seen.add(v);

    int i = n;
    int last = prev[prev.length - 1];
    int cand = last - i;
    int next = (cand > 0 && !seen.contains(cand)) ? cand : (last + i);

    int[] res = new int[n];
    System.arraycopy(prev, 0, res, 0, prev.length);
    res[n - 1] = next;
    return res;
}


}
