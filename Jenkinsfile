node ('master')
{
    stage('Build and Test')
    {
        currentBuild.result = "SUCCESS"
        try
        {
            // Set the JDK
            env.JAVA_HOME="${tool 'JDK-11'}"
            // Define maven version to use
            env.PATH = "${tool 'maven-3.9.6'}/bin:${env.PATH}"
            // Pull down code from gitlab
            checkout scm
            sh 'mvn clean install'
        //step($class: 'CucumberTestResultArchiver', testResults: 'cucumber.json')
        step([$class: 'CucumberReportPublisher', jsonReportDirectory: './', fileIncludePattern: 'cucumber.json'])
            mail body: 'Project Build Successful',
                 from: 'kla@bizrate.com',
                 subject: 'Project Build Successful',
                 // to: 'kla@bizrate.com'
                 to: 'TI-BRI-COREINSIGHTS-ENGINEERING@bizrate.com'
        }
        catch (err)
        {
        // Ver 1.2
            currentBuild.result = "FAILED"
                mail body: 'Project Build Failed',
                     from: 'kla@bizrate.com',
                     subject: 'Project Build Failed',
                     //to: 'kla@bizrate.com'
                    to: 'TI-BRI-COREINSIGHTS-ENGINEERING@bizrate.com'

            throw err
        }
    }
}
