public static int smallestPositive(int[] A) {

        Set<Integer> set = new TreeSet<>();

        for (int s: A) {
            set.add(s);
        }

        int N = set.size();

        int[] C = new int[N];

        int index = 0;

        for (int s : set) {
            C[index++] = s;
        }

        for (int i = 0; i < N; i++) {

            if (C[i] > 0 && C[i] <= N) {
                C[i] = 0;
            }
        }

        for (int i = 0; i < N; i++) {

            if (C[i] != 0) {
                return (i + 1);
            }
        }

        return (N + 1);
    }