#include <criterion/criterion.h>

// Define the prototype for the solution function
int is_valid_ip(const char * addr);

// Perform some example tests
Test(is_valid_ip, example_tests) {
    cr_expect_eq(is_valid_ip("12.255.56.1"), 1, "\"%s\" IS a valid IP", "12.255.56.1");
    cr_expect_eq(is_valid_ip(""), 0, "\"%s\" IS a valid IP", "");
    cr_expect_eq(is_valid_ip("abc.def.ghi.jkl"), 0, "\"%s\" IS a valid IP", "abc.def.ghi.jkl");
    cr_expect_eq(is_valid_ip("123.456.789.0"), 0, "\"%s\" IS a valid IP", "123.456.789.0");
    cr_expect_eq(is_valid_ip("12.34.56"), 0, "\"%s\" IS a valid IP", "12.34.56");
    cr_expect_eq(is_valid_ip("12.34.56 .1"), 0, "\"%s\" IS a valid IP", "12.34.56 .1");
    cr_expect_eq(is_valid_ip("12.34.56.-1"), 0, "\"%s\" IS a valid IP", "12.34.56.-1");
    cr_expect_eq(is_valid_ip("123.045.067.089"), 0, "\"%s\" IS a valid IP", "123.045.067.089");
};