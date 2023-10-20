## Lab Report 1

### `cd` command

1. **Using the command with no arguments**

![image](https://github.com/cnidyllic/cse15l-lab-reports/assets/146884284/4e0e8107-9d18-4038-b891-b1e5e430a5eb)

- Working Directory: `/home`
- When `cd` is executed with no arguments, it changes the working directory to the user's home directory, in this case, `/home`.

2. **Using the command with a path to a directory**

![image](https://github.com/cnidyllic/cse15l-lab-reports/assets/146884284/886c39f9-14eb-4436-94d3-9b591a7c1b62)

- Working Directory: `/home/lecture1`
- There was no output as the `cd` command successfully changed the directory to `lecture1`.

3. **Using the command with a path to a file (Incorrect usage)**

![image](https://github.com/cnidyllic/cse15l-lab-reports/assets/146884284/08ca60fe-6878-457d-bd29-ec6b245a4ab6)

- Working Directory: `/home`
- The working directory remained at `/home`. The output indicates an error because the `cd` command is used for changing to directories, and the provided path points to a file.

---

### `ls` command

1. **Using the command with no arguments**

![image](https://github.com/cnidyllic/cse15l-lab-reports/assets/146884284/539e2c51-1f70-4268-99da-ff096725ecdf)

- Working Directory: `/home`
- The command listed the directory `lecture1`, which is located under the current working directory `/home`.

2. **Using the command with a path to a directory**

![image](https://github.com/cnidyllic/cse15l-lab-reports/assets/146884284/8d707930-e451-424a-a166-849f3384c619)

- Working Directory: `/home`
- The command listed the files within the `lecture1` directory.

3. **Using the command with a path to a file**

![image](https://github.com/cnidyllic/cse15l-lab-reports/assets/146884284/202fe3a6-8e85-4630-9557-217cff54ca03)

- Working Directory: `/home`
- The output is the path to the file specified, which is not an error. Typically, the ls command lists the contents of a directory, but when given a file path as an argument, it simply prints the path.

---

### `cat` command

1. **Using the command with no arguments**

![image](https://github.com/cnidyllic/cse15l-lab-reports/assets/146884284/c619a758-1d4d-4846-8ade-46b4e59a6b53)

- Working Directory: `/home`
- The cat command without arguments waits for input. It is in a listening state, and you can exit this state by pressing CTRL + C or by providing input followed by CTRL + D.

2. **Using the command with a path to a directory (Incorrect usage)**

![image](https://github.com/cnidyllic/cse15l-lab-reports/assets/146884284/8b1b2e02-03b4-49bb-832f-d8387e0f46c1)

- Working Directory: `/home`
- The output is an error since the cat command expects a file and not a directory.

3. **Using the command with a path to a file**

![image](https://github.com/cnidyllic/cse15l-lab-reports/assets/146884284/fa4cfcd7-1c09-4cc8-83fd-e1c7a2b43f32)

- Working Directory: `/home`
- The output displays the contents of the file `en-us.txt`.
