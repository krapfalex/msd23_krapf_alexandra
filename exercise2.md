## git commands

| commands | function |
| -------- | -------- |
| git config | eine Funktion, die zum Einrichten von Git-Konfigurationswerten |
| git init | Mit dem Befehl git init wird ein neues Git-Repository erstellt |
| git commit | erfasst einen Snapshot der aktuell bereitgestellten Änderungen des Projekts |
| git status | lässt anzeigen, welche Dateien in der Staging-Umgebung sind, welche nicht und welche nicht verfolgt werden. |
| git add | Verschiebt Änderungen aus dem Arbeitsverzeichnis in die Staging-Umgebung |
| git log | listet git log die in diesem Repository vorgenommenen Commits in umgekehrter chronologischer Reihenfolge auf
| git diff| zeigt standardmäßige Änderungen seit dem letzten Commit, die nicht committet wurden |
| git pull |  wird verwendet, um Inhalte aus einem Remote-Repository herunterzuladen und unverzüglich das lokale Repository zu aktualisieren |
| git push | lädt Inhalte aus einem lokalen auf ein zentrales Repository hoch |
<br>

## Verwendete Befehle: 

1. git config --global user.name "Alexandra Krapf"
2. git config --global user.email alexandra.krap@edu.fh-joanneum.at
3. git config --global init.defaultBranch main
4. git config --global pull.ff true
5. git clone https://github.com/krapfalex/msd23_krapf_alexandra
6. cd msd23_krapf_alexandra
 git add README.md
7. git add exercise1.md
8. git commit -m "first_commit"
9. touch .gitignore


10. git status <br>
On branch main
Your branch is based on 'origin/main', but the upstream is gone.
  (use "git branch --unset-upstream" to fixup)

    Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore
        ex1_1.jpg.JPG
        exercise1.html
        exercise1.pdf

    nothing added to commit but untracked files present (use "git add" to track)

11. git add .gitignore

12. git status <br>
On branch main
Your branch is based on 'origin/main', but the upstream is gone.
  (use "git branch --unset-upstream" to fixup)

    Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   .gitignore

    Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ex1_1.jpg.JPG
        exercise1.html
        exercise1.pdf

13. git add exrcise2.md
14. git commit -m "second_commit"
15. git log
16. git push
