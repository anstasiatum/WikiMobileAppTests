<p align="center">
  <a href="https://en.wikipedia.org/wiki/Main_Page" target="_blank">
    <img src="readmemedia/wikipedia_logo.png" width="500" alt="WikipediaLogo">
  </a>
</p>

# Wikipedia Mobile App Automated Tests

## 📜 Summary
- [Stack](#-stack)
- [Automated test cases](#-automated-test-cases)
- [Build](#-build)
- [Jenkins](#-jenkins)
- [Allure report](#-allure-report)
- [Notifications](#-notifications)

  
## 💻 Stack

<div align="center">
  <table>
    <tr>
      <!-- First row -->
      <td align="center" width="110">
        <a href="https://www.java.com" target="_blank">
          <img src="readmemedia/java-original-wordmark.svg" width="48" height="48" alt="Java" />
        </a>
        <br>Java 21
      </td>
      <td align="center" width="110">
        <a href="https://junit.org/junit5/" target="_blank">
          <img src="readmemedia/junit-original.svg" width="48" height="48" alt="JUnit 5" />
        </a>
        <br>JUnit 5
      </td>
      <td align="center" width="110">
        <a href="https://gradle.org/" target="_blank">
          <img src="readmemedia/gradle-original.svg" width="48" height="48" alt="Gradle" />
        </a>
        <br>Gradle
      </td>
      <td align="center" width="110">
        <a href="https://selenide.org/" target="_blank">
          <img src="readmemedia\Selenide.svg" width="48" height="48" alt="Selenide" />
        </a>
        <br>Selenide
      </td>
      <td align="center" width="110">
        <a href="https://appium.io" target="_blank">
          <img src="readmemedia/appium-logo.png" width="48" height="48" alt="Appium" />
        </a>
        <br>Appium
      </td>
    </tr>
    <tr>
      <!-- Second row -->
      </td>
      <td align="center" width="110">
        <a href="https://docs.qameta.io/allure/" target="_blank">
          <img src="readmemedia/Allure.svg" width="48" height="48" alt="Allure" />
        </a>
        <br>Allure
      </td>
    <td align="center" width="110">
        <a href="https://rest-assured.io/" target="_blank">
          <img src="readmemedia/RestAssuredLogo.png" width="48" height="48" alt="Rest Assured" />
        </a>
        <br>Rest Assured
      </td>
      <td align="center" width="110">
        <a href="https://www.jenkins.io/" target="_blank">
          <img src="readmemedia/jenkins-original.svg" width="48" height="48" alt="Jenkins" />
        </a>
        <br>Jenkins
      <td align="center" width="110">
        <a href="https://web.telegram.org/" target="_blank">
          <img src="readmemedia/Telegram.svg" width="48" height="48" alt="Telegram" />
        </a>
        <br>Telegram
      </td>
    </tr>
  </table>
</div>

- Developed using **Java 21**, **JUnit**, and **Selenide**
- Built via **Gradle**
- Integrated build with **Jenkins**
- Sending notifications to **Telegram**

## ✅ Automated test cases
1. Search for an article
2. Login without password
3. Check In The News widget

## ▶️ Build

The build is parametrized. These tests can be run in the emulator and remotely in the Browserstack environment. The Parameters can be set in the `.properties` files. 

To run the tests on your emulator use:

```bash
clean test -Denv=emulator
```

To run the tests on Browserstack use:
```bash
clean test -Denv=browserstack
```

## <img src="readmemedia/jenkins-original.svg" width="48" height="48" alt="Jenkins" /> [Jenkins](https://jenkins.autotests.cloud/job/WikipediaMobileAppTests/)

The project is integrated with Jenkins, where the tests can be run remotely in the Browsertsatck environment.

<img src="readmemedia/JenkinsMainPage.png" alt="Jenkins Main Page">


## <img src="readmemedia/Allure.svg" width="48" height="48" alt="Allure" /> [Allure report](https://jenkins.autotests.cloud/job/WikipediaMobileAppTests/30/allure/)

### Allure report page
<img src="readmemedia/AllureReportMainPage.png" alt="Allure Report">

### Each test in the report contains:
- Test steps
- Page Source
- Video of the test run
  
<img src="readmemedia/TestRunVideo.gif" alt="Video of the test run">

## <img src="readmemedia/Telegram.svg" width="48" height="48" alt="Telegram" /> Notifications

After each run a notification is sent automatically to **Telegram** with a brief summary of the test results including the number of passed and failed tests, run duration, and report link. This functianlity is implemented using the [allure-notifications](https://github.com/qa-guru/allure-notifications) library which also allows sending notifications to Slack, Discord, and other messengers.

<img src="readmemedia/TelegramReport.png" alt="Telegram Notification">
