scala-project-shell
====================

A good place to start for a quick 'n' dirty scala program.

1. Create a [new repo](https://github.com/new) named $newproj.
2. `export newproj=repo-name`
3. `git clone git@github.com:leifwickland/scala-project-shell.git $newproj
4. `cd $newproj`
5. `sed -i '1 s/.*/$newproj/' README.md`
6. `git add README.md`
7. `git ci -m "Set project name"`
8. `git remote add origin git@github.com:leifwickland/$newproj.git`
9. `git push -u origin master`
