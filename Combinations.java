/** This class provides a single static method to compute all
 * combinations that only contain four cards. In other words,
 * these are all the possible methods of selecting cards.
 * 
 *
 * @author Yankun Qiu <yankunq@student.unimelb.edu.au>
 */

public class Combinations {

    /** This method computes all the combinations that contains
     *  only four elements from the input array, in this case, 
     *  all the elements are strings. All the elements appear
     *  in the output array in the order they appear in the input
     *  array.
     *  
     *  A for loop is used to find all the numbers from 15 to 
     *  15<<(size of input array-4) who have four ones in their
     *  binary format. The reason 15 is chosen as beginning is the 
     *  binary format of 15 is 1111,any numbers less than 15 can't 
     *  have four ones in their binary format. And the reason I 
     *  choose 15<<(size of input array-4) as the end is that any 
     *  numbers between 15<<(size of input array-4) and 2^(size of 
     *  input array)-1 must have more than four ones in their binary
     *  format.
     *  
     *  
     */
    public static String[][] combinations(String[] lines) {
    	int total = Mathematics.nOutOfM(4, lines.length);
    	int flag = 0;
    	String[][] result = new String[total][4];
    	for(int i = 15;i <= 15<<(lines.length-4);i++){
    		int count =0;
    		if(Mathematics.oneInBinary(i) == 4){
    			int[] binary = Mathematics.deciToBinary(i, lines.length);
    			for(int j = 0;j < lines.length;j++){
    				if(binary[j] == 1){
    					result[flag][count++] = lines[j];
    				}
    			}
    			flag++;
    		}
    	}
    	
		return result;
    }
}