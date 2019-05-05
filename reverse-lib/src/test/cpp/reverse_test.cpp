#include "gtest/gtest.h"
#include "reverse.h"

TEST(ReverseTests, test_constructor) {
    char* expected = "olleH";
    char* actual = reverse("Hello");

    ASSERT_STREQ(actual, expected);
}
