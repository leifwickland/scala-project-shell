scala-project-shell
====================

A good place to start for a quick 'n' dirty scala program.

Create a [new repo](https://github.com/new) named $newproj. Then:

    export newproj=repo-name
    git clone git@github.com:leifwickland/scala-project-shell.git $newproj
    cd $newproj
    sed -i '1 s/.*/$newproj/' README.md
    git add README.md
    git ci -m "Set project name"
    git remote add origin git@github.com:leifwickland/$newproj.git
    git push -u origin master
