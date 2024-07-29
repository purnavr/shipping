@Library('roboshop') _

env.component="shipping"
env.app_lang = "maven"
env.sonar_extra_opts = "-Dsonar.java.binaries=./target"
ci()

//sh 'sonar-scanner -Dsonar.host.url=http://172.31.21.138:9000 -Dsonar.login=${SONARQUBE_USER} -Dsonar.password=${SONARQUBE_PASS} -Dsonar.projectKey=${component} ${sonar_extra_opts} -Dsonar.qualitygate.wait=true '