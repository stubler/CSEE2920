import java.util.Arrays;
import java.util.Date;


public class Block{

    protected String data;
    protected int prevHash;
    protected int hash;
    protected Date timestamp;
    
    public Block(String data, int prevhash){
	this.data = data;
	this.prevHash = prevhash;
	this.timestamp = new Date();
	String oldhash = Integer.toString(prevHash);
	String[] blockData = new String[]{oldhash, data};
	hash = blockData.hashCode();
    }
    
    public String getData(){
	return data;
    }
    
    public int getPrevHash(){
	return prevHash;
    }
    
    public int getHash(){
	return hash;
    }
    
    public Date getDate(){
	return timestamp;
    }
    
    public String getTime(){
	return timestamp.toString();
    }
}
