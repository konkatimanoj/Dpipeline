def gitdownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}.git"
}
def gitbuild(repo)
{
    sh "mvn pacakage"
}
