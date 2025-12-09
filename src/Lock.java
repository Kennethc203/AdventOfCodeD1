public class Lock {
    int currentNum = 50;
    int zeroCount;

    public void rotate(String dir, int num){
        if (dir.equals("L")){
            currentNum -= num;

            if (currentNum < 0){
                reset();
                if (currentNum < 0) currentNum += 100;
            }
        }
        else if(dir.equals("R")){
            currentNum += num;
            if (currentNum > 99) reset();
        }
        if (currentNum == 0) zeroCount++;
    }

    public int getZeroCount(){
        return zeroCount;
    }
    public int getCurrentNum(){
        return currentNum;
    }
    public void setCurrentNum(int i){
        currentNum = i;
    }

    public void reset(){
        currentNum %= 10000;
        currentNum %= 1000;
        currentNum %= 100;
    }
}
