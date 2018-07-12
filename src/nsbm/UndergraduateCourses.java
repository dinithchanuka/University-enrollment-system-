/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

/**
 *
 * @author Hp
 */
public class UndergraduateCourses {
    
    private String subcode;
    private String subname;
    private int credits;
    private String scheme;
    private Boolean compulsory;
    private String year;
    private String sem;

    
    public String getSubname() {
        return subname;
    }

    /**
     * @param subname the subname to set
     */
    public void setSubname(String subname) {
        this.subname = subname;
    }

    /**
     * @return the credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * @return the scheme
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * @param scheme the scheme to set
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * @return the subcode
     */
    public String getSubcode() {
        return subcode;
    }

    /**
     * @param subcode the subcode to set
     */
    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }

   
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the sem
     */
    public String getSem() {
        return sem;
    }

    /**
     * @param sem the sem to set
     */
    public void setSem(String sem) {
        this.sem = sem;
    }

    /**
     * @return the compulsory
     */
    public Boolean getCompulsory() {
        return compulsory;
    }

    /**
     * @param compulsory the compulsory to set
     */
    public void setCompulsory(Boolean compulsory) {
        this.compulsory = compulsory;
    }
    
}
