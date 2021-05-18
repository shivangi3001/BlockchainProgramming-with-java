package tools;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// demonstrate a hash function
        String statement1 = "My world is perfect";
        int hashvalue = statement1.hashCode();

        System.out.println(statement1 + "has hash value "+ hashvalue);

    //hashing an array
        String [] list1 = {"Aman", "Neha", "Priya"};
        String [] list2 = {"Aman", "Neha", "Priya"};
        int hash1 = Arrays.hashCode(list1);
        int hash2 = Arrays.hashCode(list2);
        System.out.println("hash1 = "+ hash1 + "\n" +"hash2 = "+hash2);

        //demonstrating a series of blocks in a chain
        ArrayList<Block> blockChain = new ArrayList<Block>();

        //building first block in the chain
        String[] initialValues = {"Shivi has $700", "Madhu has $550"};
        Block firstBlock = new Block(initialValues, 0);

        //now adding 1st block to the blockchain
        blockChain.add(firstBlock);
        System.out.println("First block is "+ firstBlock.toString());
        System.out.println("The blockchain is "+ blockChain.toString());
        System.out.println();
        //blockHash=13497437

        //now adding block two
        String[] shiviGives = {"Shivi gives Anu $70", "Shivi gives Om has $30", "shivi gives Tina $50"};
        Block secondBlock = new Block(shiviGives, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("Second block is "+ secondBlock.toString());
        System.out.println("The blockchain is "+ blockChain.toString());
        System.out.println();
        //blockHash=1498468931

        //block 3
        String[] shiviGets = {"Anu gives Shivi $20", "Madhu gives Shivi has $60"};
        Block thirdBlock = new Block(shiviGets, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("Third block is "+ thirdBlock.toString());
        System.out.println("The blockchain is "+ blockChain.toString());
        //blockHash=-580825096
    }
}
