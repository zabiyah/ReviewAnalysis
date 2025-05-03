import java.util.ArrayList;
public class ReviewAnalysis {
    /** All user reviews to be included in this analysis */
    private Review[] allReviews;


    /** Initializes allReviews to contain all the Review objects to be analyzed */
    public ReviewAnalysis(Review[] reviews) {
    allReviews = reviews;
    }
    


    /**
     * Returns a double representing the average rating of all the Review objects to
     * be
     * analyzed, as described in part (a)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     */
    public double getAverageRating() {
     double sum = 0;
        for (Review  r: allReviews){
           sum+= r.getRating();
        }  
        return sum/(allReviews.length); 
    /* to be implemented in part (a) */ }


    /**
     * Returns an ArrayList of String objects containing formatted versions of
     * selected user comments, as described in part (b)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     * Postcondition: allReviews is unchanged.
     */
    public ArrayList<String> collectComments() {
    ArrayList<String> comments = new ArrayList<String>();
    for(int i = 0; i<allReviews.length; i++){
        String s = i+"-"+allReviews[i].getComment();
        String last = s.substring(s.length()-1);
        if(!last.equals(".")&&!last.equals("!")){
            s+=".";
        }
        if(s.indexOf("!")>0) comments.add(s);
        
    }   
    return comments;
    }
}
