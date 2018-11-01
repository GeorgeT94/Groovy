class MyTestCase extends GroovyTestCase {

    void testInvalidIndexAccess1() {
        def numbers = [1,2,3,4]
        shouldFail {
            numbers.get(4)
        }
    }



    void testInvalidIndexAccess3() {
        def numbers = [1,2,3,4]
        def msg = shouldFail IndexOutOfBoundsException, {
            numbers.get(4)
        }
        assert msg.contains('Index: 4, Size: 4') ||
            msg.contains('Index 4 out-of-bounds for length 4') ||
            msg.contains('Index 4 out of bounds for length 4')
    }
}

