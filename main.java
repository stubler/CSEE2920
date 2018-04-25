// CSEE2920
//Code used in the Design Methodology Ball-Cap Fan Project



public class main {
	
	public static void main(String[] args){
		
		Block block0 = new Block("23.7 degrees Celsius", 0);
		Block block1 = new Block("23.7 degrees Celsius", block0.getHash());
		Block block2 = new Block("23.7 degrees Celsius", block1.getHash());
		Block block3 = new Block("23.7 degrees Celsius", block2.getHash());
		Block block4 = new Block("23.7 degrees Celsius", block3.getHash());
		Block block5 = new Block("23.7 degrees Celsius", block4.getHash());
		Block block6 = new Block("23.7 degrees Celsius", block5.getHash());
		Block block7 = new Block("26.1 degrees Celsius", block6.getHash());
		Block block8 = new Block("25.6 degrees Celsius", block7.getHash());
		
		System.out.println("__Block0__ \n" +
			"Temperature: " + block0.getData() + "\n" +
			"Previous Hash: " + block0.getPrevHash() +  "\n" +
			"Hash: " + block0.getHash() + "\n" +
			"Timestamp: " + "23:11:20" + "\n");
			
		System.out.println("__Block1____ \n" +
			"Temperature: " + block1.getData() + "\n" +
			"Previous Hash: " + block1.getPrevHash() +  "\n" +
			"Hash: " + block1.getHash() + "\n" +
			"Timestamp: " + "23:11:30" + "\n");
			
		System.out.println("__Block2____ \n" +
			"Temperature: " + block2.getData() + "\n" +
			"Previous Hash: " + block2.getPrevHash() +  "\n" +
			"Hash: " + block2.getHash() + "\n" +
			"Timestamp: " + "23:11:40" + "\n");
			
		System.out.println("__Block3__ \n" +
			"Temperature: " + block3.getData() + "\n" +
			"Previous Hash: " + block3.getPrevHash() +  "\n" +
			"Hash: " + block3.getHash() + "\n" +
			"Timestamp: " + "23:11:50" + "\n");
			
		System.out.println("__Block4__ \n" +
			"Temperature: " + block4.getData() + "\n" +
			"Previous Hash: " + block4.getPrevHash() +  "\n" +
			"Hash: " + block4.getHash() + "\n" +
			"Timestamp: " + "23:12:0" + "\n");
			
		System.out.println("__Block5__ \n" +
			"Temperature: " + block5.getData() + "\n" +
			"Previous Hash: " + block5.getPrevHash() +  "\n" +
			"Hash: " + block5.getHash() + "\n" +
			"Timestamp: " + "23:12:10" + "\n");
			
		System.out.println("__Block6__ \n" +
			"Temperature: " + block6.getData() + "\n" +
			"Previous Hash: " + block6.getPrevHash() +  "\n" +
			"Hash: " + block6.getHash() + "\n" +
			"Timestamp: " + "23:12:20" + "\n");
			
		System.out.println("__Block7__ \n" +
			"Temperature: " + block7.getData() + "\n" +
			"Previous Hash: " + block7.getPrevHash() +  "\n" +
			"Hash: " + block7.getHash() + "\n" +
			"Timestamp: " + "23:12:30" + "\n");
			
		System.out.println("__Block8__ \n" +
			"Temperature: " + block8.getData() + "\n" +
			"Previous Hash: " + block8.getPrevHash() +  "\n" +
			"Hash: " + block8.getHash() + "\n" +
			"Timestamp: " + "23:12:40" + "\n");
			
			
	}
	
}
