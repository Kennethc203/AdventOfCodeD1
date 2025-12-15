public class Lock {
    int currentNum = 50;
    int zeroCount;

    public void rotate(String dir, int num) {
        if (dir.equals("L")) {
            currentNum -= num;

            if (currentNum < 0) {
                reset();
                if (currentNum < 0) currentNum += 100;
            }
        } else if (dir.equals("R")) {
            currentNum += num;
            if (currentNum > 99) reset();
        }
        if (currentNum == 0) zeroCount++;
    }

    public int getZeroCount() {
        return zeroCount;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int i) {
        currentNum = i;
    }

    public void reset() {
        currentNum %= 10000;
        currentNum %= 1000;
        currentNum %= 100;
    }

    public void rotateHolmer(String dir, int num) {
        if (dir.equals("R")) {
            while (num != 0) {
                currentNum++;
                currentNum %= 100;
                if (currentNum == 0) zeroCount++;
                num -= 1;
            }
        } else if (dir.equals("L")) {
            while (num != 0) {
                currentNum--;
                if (currentNum < 0) currentNum += 100;
                if (currentNum == 0) zeroCount++;
                num -= 1;
            }
        }
    }

    public void rotate2(String dir, int num) {
        if (dir.equals("R")) {
            currentNum += num;
            zeroCount += num / 100;
            if (currentNum > 99) reset();
        }
        if (dir.equals("L")) {
            currentNum -= num;
            zeroCount += Math.abs(num / 100);
            if (currentNum < 0) {
                reset();
                if (currentNum < 0) currentNum += 100;
            }
        }
    }
}
