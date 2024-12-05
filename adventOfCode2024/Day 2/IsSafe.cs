  static bool IsSafe(int[] levels)
    {
        if (levels.Length < 2) return false;

        bool increasing = levels[1] > levels[0];
        bool decreasing = levels[1] < levels[0];

        for (int i = 1; i < levels.Length; i++)
        {
            int diff = Math.Abs(levels[i] - levels[i - 1]);
            if (diff < 1 || diff > 3) return false;
            if (increasing && levels[i] <= levels[i - 1]) return false;
            if (decreasing && levels[i] >= levels[i - 1]) return false;
        }
        return true;
    }
