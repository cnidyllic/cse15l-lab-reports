# Lab Report 1 

## `cd` command
1. `cd`
![image] 

The working directory was `/home` when the code was run. There was no output as the `cd` command is intended to change the working directory. 
Moreover, the code ran fine and produced no errors.

2. `cd lecture1`
![image]

The working directory changed to `/home/lecture1` after the code was ran. The `cd` command was used to changed the directory
so it did what it was meant to do. There was no output nor error.

3. `cd /home/lecture1/messages/en-us.txt`
![image]

The working directory during the execution of the code was `/home/lecture1/messages/en-us.txt`. The output was an error because
the `cd` command is only meant to be used to change paths to directories, not files.

## `ls` command
1. `ls`

The working directory did not change, and is still `/home`. The output listed the directory `lecture1`, which was immediately below
the working directory. The command ran fine and did not produce an error.

2. `ls lecture1`

The working directory was `/home/lecture1/`. The outputs were `messages`, `Hello.java`, and `README` which are the files within the `lecture1` folder.
Therefore, there was an output and it was not an error.

3. `ls lecture1/messages/en-us.txt` 

The working directory is `/home/lecture1/en-us.txt` itself. The output is the file path. While not an error, the output is such because there is nothing below the file.

## `cat` command
1. `cat`

The working directory during the execution of the code was `/home`. The `cat` command is meant to print out the content within a file. While there was no error, there was also no output because the working directory does not have a path to such file.

2. `cat lecture1`

The working directory during the execution of the code was `/home/lecture1/`. The output is simply stating an error that the working directory is a path to a folder, which is not a file.

3. `cat lecture/messages/en-us.txt`

The working directory during the execution of the code was `/home/lecture1/messages/en-us.txt`. The output that is printed is the contents within the file `en-us.txt`.
Since this is a path to a file with readable contents, there was not an error this time.
