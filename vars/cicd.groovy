def gitDownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}.git"
}
def gitbuild()
{
    sh "mvn pacakage"
}
