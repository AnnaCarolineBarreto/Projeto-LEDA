package util.writePath;

import util.FormatPath;

public class DataWritePathInsertionSort implements DataWritePath {
	
	private String pathDateBestCase = "data\\processedData\\sortingResults\\insertionSort\\passwords_date_insertionSort_melhorCaso.csv";
	private String pathDateAverageCase = "data\\processedData\\sortingResults\\insertionSort\\passwords_date_insertionSort_medioCaso.csv";
	private String pathDateWorstCase = "data\\processedData\\sortingResults\\insertionSort\\passwords_date_insertionSort_piorCaso.csv";
	
	private String pathMonthBestCase = "data\\processedData\\sortingResults\\insertionSort\\passwords_month_date_insertionSort_melhorCaso.csv";
	private String pathMonthAverageCase = "data\\processedData\\sortingResults\\insertionSort\\passwords_month_date_insertionSort_medioCaso.csv";
	private String pathMonthWorstCase = "data\\processedData\\sortingResults\\insertionSort\\passwords_month_date_insertionSort_piorCaso.csv";
	
	private String pathLengthBestCase = "data\\processedData\\sortingResults\\insertionSort\\passwords_length_insertionSort_melhorCaso.csv";
	private String pathLengthAverageCase = "data\\processedData\\sortingResults\\insertionSort\\passwords_length_insertionSort_medioCaso.csv";
	private String pathLengthWorstCase = "data\\processedData\\sortingResults\\insertionSort\\passwords_length_insertionSort_piorCaso.csv";
	
	
	public DataWritePathInsertionSort() {
	}

	@Override
	public String getPathDateBestCase() {
		return FormatPath.getPath(pathDateBestCase);
	}
	
	@Override
	public String getPathDateAverageCase() {
		return FormatPath.getPath(pathDateAverageCase);
	}
	
	@Override
	public String getPathDateWorstCase() {
		return FormatPath.getPath(pathDateWorstCase);
	}
	
	@Override
	public String getPathMonthBestCase() {
		return FormatPath.getPath(pathMonthBestCase);
	}
	
	@Override
	public String getPathMonthAverageCase() {
		return FormatPath.getPath(pathMonthAverageCase);
	}
	
	@Override
	public String getPathMonthWorstCase() {
		return FormatPath.getPath(pathMonthWorstCase);
	}
	
	@Override
	public String getPathLengthBestCase() {
		return FormatPath.getPath(pathLengthBestCase);
	}
	
	@Override
	public String getPathLengthAverageCase() {
		return FormatPath.getPath(pathLengthAverageCase);
	}
	
	
	public String getPathLengthWorstCase() {
		return FormatPath.getPath(pathLengthWorstCase);
	}
	
	
	
	

}
