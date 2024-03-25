def gitDownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}.git"
}
def gitbuild()
{
    sh "mvn package"
}
def gitdeploy(jobname,ip,name)
{
    sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${name}.war"
}
def gitexec()
{
    sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}


