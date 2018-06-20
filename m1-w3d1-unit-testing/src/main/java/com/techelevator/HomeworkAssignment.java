package com.techelevator;

public class HomeworkAssignment {
	
    private int totalMarks;
    private int possibleMarks;
    private String submitterName;
    private double percentage;

    /**
     * Homework assignment requires possible marks 
     * @param possibleMarks
     */
    public HomeworkAssignment(int possibleMarks, int totalMarks, String name) {
    	if(totalMarks > 0 && totalMarks >= possibleMarks ){
        this.possibleMarks = possibleMarks;
        this.submitterName = name;
        this.totalMarks = totalMarks;
        this.percentage = (double)totalMarks / (double)possibleMarks;
    	}
    	
    }

    /**
     * Total number of marks received 
     * @return
     */
    public int getTotalMarks() {
        return totalMarks;    
    }


    /**
     * Possible number of marks to get right on the homework assignment. 
     * @return
     */
    public int getPossibleMarks() {
        return possibleMarks;            
    }


    /**
     * Name of the person who submitted the homework assignment 
     * @return
     */
    public String getSubmitterName() {
        return submitterName;
    }
    

    /**
     * Letter grade for the assignment. (90-100 A, 80-89 B, 70-79 C, 60-69 D, otherwise F) 
     * @return
     */
    public String getLetterGrade() {
        
        if (percentage >= 0.6f && percentage <= 0.69f) {
            return "D";
        }
        else if (percentage >= 0.7f && percentage <= 0.79f) {
            return "C";
        }
        else if (percentage >= 0.8f && percentage <= 0.89f) {
            return "B";
        }
        else if (percentage >= 0.9f && percentage <= 0.99f) {
            return "A";
        }                                                
        else {
            return "F";
        }
        
    }

}
