package src.array;

/*
* for循环就可以遍历数组。
* 因为数组的每个元素都可以通过索引来访问，因此，使用标准的for循环可以完成一个数组的遍历
* */
public class For_array2 {
    public static void main(String[] args){
        int[] ns = {1, 32, 43, 32, 55};
        // 初始条件为i=0，因为索引总是从0开始
        // 继续循环的条件为i < ns.length
        for (int i = 0; i < ns.length; i++){
            int n = ns[i];

            System.out.println("ns[" + i + "] = " + n);
        }
    }
}

/*
ns[0] = 1
ns[1] = 32
ns[2] = 43
ns[3] = 32
ns[4] = 55
* */