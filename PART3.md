The Script is written for regression testing within a daily review and report, to be integrated into Testlink, Jenkins and Birt for example.

As it is written with Maven, it also allows its use as an integration test, to test if an integration between several modules works.

By sending the screenshots to a PHP it allows to use DevOps tools such as Codeship and pass all the tests before uploading

The pros and cons depend on the purpose of the tests.
A good product over time? regression testing

Test if a change in the code does not spoil anything? integration test and unit test

What prevents upload if all tests are not correct? Codeship
