import org.junit.Assert;
import org.junit.Test;
import pl.com.bottega.ecommerce.sharedkernel.Money;

import static org.hamcrest.CoreMatchers.*;

/**
 * Created by Wojciech Szczepaniak on 19.03.2017.
 */
public class MoneyTest {

    @Test
    public void multiplyByPositiveNumber() {
        Money money = new Money(1000).multiplyBy(2);
        Money expected = new Money(2000);

        Assert.assertThat(money, is(equalTo(expected)));
    }

    @Test
    public void multiplyByNegativeNumber() {
        Money money = new Money(1000).multiplyBy(-2);
        Money expected = new Money(-2000);

        Assert.assertThat(money, is(equalTo(expected)));
    }

    @Test
    public void mutliplyByZero() {
        Money money = new Money(1000).multiplyBy(0);
        Money expected = new Money(0);

        Assert.assertThat(money, is(equalTo(expected)));
    }
}
