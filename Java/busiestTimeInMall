class busyTimeInMall {

	static int findBusiestPeriod(int[][] data) {

		// your code goes here
		if (data.length == 1)
			return data[0][0];
		int count = 0;
		int max = 0;
		int ret = 0;
		for (int i = 0; i < data.length; i++) {

			if (data[i][2] == 1) {
				count += data[i][1];
			} else if (data[i][2] == 0) {
				count -= data[i][1];
			}

			if (i < data.length - 1 && data[i][0] == data[i + 1][0])
				continue;
			if (count > max) {
				max = count;
				ret = data[i][0];
			}

		}
		return ret;

	}

	public static void main(String[] args) {
		int[][] data = { { 1487799425, 14, 1 }, { 1487799427, 17, 1 } };

		System.out.println(findBusiestPeriod(data));

	}

}
