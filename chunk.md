


Array [1,2,3,4,5]

- if the chunk size is 1, [1,2,3,4,5]
- if the chunk size is 2, [1,2] and [3,4] and [5]
- if the chunk size is 3, [1,2,3] and [4,5]
- if the chunk size is 4, [1,2,3,4] and [5]

## 1

				public static int[][] chunkArray(int[] array, int chunkSize) {
					int numOfChunks = (int)Math.ceil((double)array.length / chunkSize);
					int[][] output = new int[numOfChunks][];

					for(int i = 0; i < numOfChunks; ++i) {
						int start = i * chunkSize;
						int length = Math.min(array.length - start, chunkSize);

						int[] temp = new int[length];
						System.arraycopy(array, start, temp, 0, length);
						output[i] = temp;
					}

					return output;
				}

 
	       
	                    public static void main(String[] args) {

		            int[] array= {1,2,3,4,5};
		            int[][] chunkArray=chunkArray(array, 2);
		
		           for (int i = 0; i < chunkArray.length; i++) {
		        	System.out.println(Arrays.toString(chunkArray[i]));
	                   }

	               }
	       
	       
	       
	-----------------------------------------------------------------------       



## Java 8

				import java.util.Arrays;

				public class ArrayChunk {
					public static void main(String[] args) {

						String[][] chunked = chunkArray("1,2,3,4,5".split(","), 2);
						System.out.println("Array with chunk size 2");
						Arrays.stream(chunked).forEach(strings -> System.out.println(String.join(",", strings)));

						chunked = chunkArray("1,2,3,4,5".split(","), 3);
						System.out.println("Array with chunk size 3");
						Arrays.stream(chunked).forEach(strings -> System.out.println(String.join(",", strings)));

						chunked = chunkArray("1,2,3,4,5".split(","), 4);
						System.out.println("Array with chunk size 4");
						Arrays.stream(chunked).forEach(strings -> System.out.println(String.join(",", strings)));

						chunked = chunkArray("1,2,3,4,5".split(","), 5);
						System.out.println("Array with chunk size 5");
						Arrays.stream(chunked).forEach(strings -> System.out.println(String.join(",", strings)));
					}

					private static String[][] chunkArray(String[] array, int chunkSize) {
						
						int chunkedSize = (int) Math.ceil((double) array.length / chunkSize); // chunked array size
						
						String[][] chunked = new String[chunkedSize][chunkSize];
						
						for (int index = 0; index < chunkedSize; index++) {
							String[] chunk = new String[chunkSize]; // small array
							System.arraycopy(array, index * chunkSize, chunk, 0, Math.min(chunkSize, array.length - index * chunkSize));
							chunked[index] = chunk;
						}
						return chunked;
					}
				}


- https://medium.com/@Dragonza/four-ways-to-chunk-an-array-e19c889eac4
- https://e.printstacktrace.blog/divide-a-list-to-lists-of-n-size-in-Java-8/
