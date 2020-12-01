package src.array;

/*
使用for each循环，直接迭代数组的每个元素
* */
public class For_each {
    public static void main(String[] args){
        int[] ns = {1, 33, 43, 21, 43};

        //变量n直接拿到ns数组的元素，而不是索引
        // or each循环无法拿到数组的索引
        for (int n : ns){
            System.out.println("n = " + n);
        }
    }
}

/*
n = 1
n = 33
n = 43
n = 21
n = 43
* */