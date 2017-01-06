package info.javagrasp;

/**
 * Created by vthiagarajan on 1/3/17.
 */
public class Comments {

    /**
    * This is a example multi line comment with special characters !!@##$#$$
    * */

    private String dummy; // Example of end of line comment with special characters !!@##$#$$ /

    private String testthis = /* In line multiline Commend is valid*/ "Hello";

    private String testthisone = /* In line multiline Commend is
                                                            valid*/ "Hello";

    private String testthistwo = "/* In line multiline Commend is
                                                            valid*/ "Hello";  //compilation error

    private String testthisthree = "/* In line multiline Commend is valid*/ Hello"; // This will print as is

    /**
     * Look at this comment //This is hybrid
     */

}
