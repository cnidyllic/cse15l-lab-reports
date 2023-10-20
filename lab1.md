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
- The command listed the directory `lecture1`, which is located under the current working directory `home`.

2. **Using the command with a path to a directory**

```bash
[user@sahara ~]$ ls lecture1
Hello.class Hello.java messages README
```

- Working Directory: `/home`
- The command listed the files within the `lecture1` directory.

3. **Using the command with a path to a file**

```bash
[user@sahara ~]$ ls lecture1/messages/en-us.txt
lecture1/messages/en-us.txt
```

- Working Directory: `/home`
- The output simply shows the path to the file.

---

### `cat` command

1. **Using the command with no arguments**

```bash
[user@sahara ~]$ cat
```

- Working Directory: `/home`
- Note: When `cat` is run without arguments, it will read from standard input. Pressing `CTRL + D` can be used to signal the end of the input.

2. **Using the command with a path to a directory (Incorrect usage)**

```bash
[user@sahara ~]$ cat lecture1
cat: lecture1: Is a directory
```

- Working Directory: `/home`
- The output is an error since the `cat` command expects a file and not a directory.

3. **Using the command with a path to a file**

```bash
[user@sahara ~]$ cat lecture1/messages/en-us.txt
Hello World!
```

- Working Directory: `/home`
- The output displays the contents of the file `en-us.txt`.

---

You can now apply the feedback provided in the annotations to correct any mistakes or make improvements. If there's any other modification you'd like, let me know!
