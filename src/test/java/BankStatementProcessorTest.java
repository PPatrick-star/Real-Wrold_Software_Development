import com.study.java.rwsd.chapter_03.domain.BankTransaction;
import com.study.java.rwsd.chapter_03.BankStatementProcessor;
import com.study.java.rwsd.chapter_03.BankTransactionIsInFebruaryAndExpensive;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BankStatementProcessorTest {

    @Test
    public void transaction_filter_in_February() {

        BankStatementProcessor givenBankStatementProcessor = new BankStatementProcessor(new ArrayList<>());

        final List<BankTransaction> transactions = givenBankStatementProcessor.findTransactions(new BankTransactionIsInFebruaryAndExpensive());

    }
}
