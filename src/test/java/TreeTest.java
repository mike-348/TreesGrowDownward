import org.junit.Assert;
import org.junit.Test;

public class TreeTest {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        //given
        TreeOneZero bt = new TreeOneZero();

        //when
        bt.add(6);
        bt.add(4);

        //then
        Assert.assertTrue(bt.contains(6));
        Assert.assertTrue(bt.contains(4));

        Assert.assertFalse(bt.contains(1));
    }

}
