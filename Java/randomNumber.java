 /* write a function List<Integer> getRandomNumbers(int low, int high, int num)
the function returns num random, non-repeating integers between the bounds of low and high
for example getRandomNumbers(0,100,5) will return 5 unique random integers between 0 and 100
and you can use the randint(x,y) function try to make the space complexity of the algorithm 
be proportional to num and not proportional to (high - low) for example getRandomNumbers(0, 4294967295, 5)
will preferably take only 5 bytes and not 4294967295 bytes in memory*/　
    public static List<Integer> getRandomNumbers(int low, int high, int num) {
		HashMap<Integer,Integer> swap_map = new HashMap<Integer, Integer>();
		Random rn = new Random();
		List<Integer> answer = new ArrayList<>();
		for (int i = low; i < low + num; i++) {
		  int first = swap_map.getOrDefault(i, i);
		  int random_number = rn.nextInt(high - i + 1) + i;
		  int second = swap_map.getOrDefault(random_number, random_number);
		  answer.add(second);
		  swap_map.put(random_number, first);
		}
