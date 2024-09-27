
package edu.jsu.mcis.cs310;
public class Test {

    private String csvOriginalString;
    private List<String[]> csvOriginal;
    private JsonObject jsonOriginal;
    private ClassSchedule schedule;
    
    @Before
    public void setUp() {

     
        
    }
        
    
    @Test
    public void testJsonToCsv() {
        
        // Convert JSON to CSV, then compare output to original CSV string
        
        try {
         
            
            assertEquals(true, true);
            
        }
        catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
        
    }
    
    
 
    
}