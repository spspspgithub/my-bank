package test.java.com.abc;

import main.java.com.abc.Transaction;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TransactionTest {
	@Test
	public void transaction() {
		Transaction t = new Transaction(5);
		assertTrue(t instanceof Transaction);
	}
}
