package firstMissingPositive;


public class MissingPositive {
   /* public int secondMissingPositive(int[] nums) {

        int[] sortedMas = new int[nums.length];
        int sortValue;
        int saveValue;
        int result = 0;
        int minValue;
        int maxValue;
        boolean flag = false;

        for(int i = 0; i < nums.length; i++){
            int minIndex = i;
            for (int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            sortValue = nums[minIndex];
            saveValue = nums[i];
            nums[i] = sortValue;
            nums[minIndex] = saveValue;

            sortedMas[i] = nums[i];
        }

        *//*Arrays.sort(nums);
        sortedMas = nums;*//*

        for (int i = 0; i < sortedMas.length; i++){
            if(i == 0){
                minValue = sortedMas[i];
                maxValue = sortedMas[i];
                if (sortedMas.length == 1 && sortedMas[i] == 1){
                    flag = true;
                }
                for(int j = i + 1; j < sortedMas.length; j++ ){
                    if(minValue == 1 || sortedMas[j] == 1){
                        flag = true;
                    }
                    if(minValue > sortedMas[j]){
                        minValue = sortedMas[j];
                    }
                    if(maxValue < sortedMas[j]){
                        maxValue = sortedMas[j];
                    }
                }
                if(minValue < 0 && maxValue < 0){
                    result = 1;
                    return result;
                }
            }
            if(!flag){
                return 1;
            }
            if((i != sortedMas.length-1 && sortedMas[i+1] - sortedMas[i] >= 2 && sortedMas[i]> 0) || sortedMas.length == 1){
                result = sortedMas[i]+1;
                break;
            }
            else {
                result = sortedMas[i] + 1;
            }
        }

        return result;
    }*/
    public int secondMissingPositive(int[] nums){
        int lengthOfArray = nums.length;
        int predict = lengthOfArray + 1;
        int numDefault = -predict;
        int value;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                nums[i] = 0;
            }
        }
        for(int num : nums){
            int i = abs(num) - 1;
            if(i >= nums.length|| i < 0){
                continue;
            }
            value = abs(nums[i]);
            if(value != 0){
                nums[i] = -value;
            }else{
                nums[i] = numDefault;
            }
        }
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] >= 0){
                return i + 1;
            }
        }
        return predict;
    }
    public int abs(int number) {
        return number < 0 ? -number : number;
    }
}
