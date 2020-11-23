package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class GiftCardTest
{
 @Test
 public void getIssuingStore()
 {
 double balance;
 GiftCard card;
 int issuingStore;

 issuingStore = 1337;
 balance = 100.00;
 card = new GiftCard(issuingStore, balance);
 assertEquals("getIssuingStore()",
 issuingStore, card.getIssuingStore());
 }
 
 @Test 
 public void deduct()
 {
	 int issuingStore;
	 double balance;
	 GiftCard card;
	 String s;
	 
	 issuingStore = 1337;
	 balance = 100.00;
	 card = new GiftCard(issuingStore, balance);
	 s = "remaining balance: "+ String.format(""%6.2f", 90.00);
	 assertEquals("deduct(10.00)"),s,card.deduct(10.0));
			 
 }
 
}