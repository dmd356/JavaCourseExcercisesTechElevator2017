package com.techelevator;

public class HomeworkAssignment {
private int totalMarks;
private int possibleMarks;
private String submitter;

public HomeworkAssignment(){
	totalMarks = 0;
	possibleMarks = 100;
	submitter = new String();
}

	public int getTotalMarks(){
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks){
		if(totalMarks > 0 && totalMarks <= this.possibleMarks)
		this.totalMarks = totalMarks;
	}

	public int getPossibleMarks(){
		return possibleMarks;
	}
	public void setPossibleMarks(int possibleMarks){
		if(possibleMarks > 0){
			this.possibleMarks = possibleMarks;
		}
	}
	public String getSubmitter(){
		return submitter;
	}
	public void setSubmitter(String submitter){
		if(submitter != null && !submitter.isEmpty()){
			
		}
	}
	public String getLettergrade(){
		double percentage = totalMarks / (double)possibleMarks;
		if(percentage >= 0.9){
			return  "A";
		}else if(percentage >= 0.8){
			return  "B";
		}else if(percentage >= 0.7){
			return  "C";
		}else if(percentage >= 0.6){
			return  "D";
		}else{
			return  "F";
		}
	
	
	
		
	}
	



}
