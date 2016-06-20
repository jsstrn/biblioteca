# Instructions

## Push your code to GitHub

1. Sign into GitHub and create a new repository

  - Repository name: twu-biblioteca-yourname
  - Privacy level: Public
  - Don't check "Initialize this repository with a README"
  - Add .gitignore: None
  - Add a license: Apache License 2.0

2. Run `git init` in the folder that was extracted from the downloaded .zip file, in order to initialize local repository.

3. Make a local commit.

```    
$ git add -A
$ git commit -m “Initial commit”
```

(Dont forget to add the hidden .idea folder, as it will make opening your project in Intellij easier.)

4. After you are done with the local commit, you can share your code with "The World" by pushing it to your
 GitHub repository.

```
$ git remote add origin https://github.com/<YOUR-GITHUB-USERNAME>/twu-biblioteca-<YOURNAME>
$ git push origin master
```

## Open project in IntelliJ

1. Go to File -> Open (or Open Project)
2. Select the directory containing the code

# Project Requirements

## Release 1 Requirements

- Welcome Message  - As a customer, I would like to see a welcome message when I start the application, so that I feel welcome and know that Biblioteca is available.
- List Books - As a customer, after the welcome message appears I would like to see a list of all library books, so that I can browse for books I might want to check-out. Assume that there is a pre-existing list of books. You don't need to support adding or removing books from the library.
- Book Details - As a customer, I'd like the list of all books to include each books Author and Year Published, so that I can be confident that I have found the book I am looking for. The book listing should have columns for this information.
- Main Menu  - As a customer, instead of automatically seeing the book list, I would like to see a list of options and be able to choose one. For now, the only option should be 'List Books'. All future options should be added to this menu also.
- Invalid Menu Option - As a customer, I would like to be notified when I choose an invalid option with the message “Select a valid option!”, so that I can know when I need to re-enter my choice.
- Quit - As a customer, I would like to continue choosing options until I choose to 'Quit'.
- Checkout Book - As a librarian, I would like customers to be able to check-out a book. Checked out books should not appear in the list of all library books.
- Successful Checkout - As a customer, I would like to know that a book has been checked out by seeing the message “Thank you! Enjoy the book”.
- Unsuccessful Checkout - As a customer, I would like to be notified if the book I tried to check-out is not available by seeing the message, “That book is not available.”, so that I know that I need to select a different book or fix my spelling error.
- Return Book - As a librarian, I would like customers to be able to return a book, so that other customers can check that book out. Returned books should appear in the list of library books.
- Successful Return - As a customer, I would like to be notified if the book I am returning belongs to this library by seeing the message, “Thank you for returning the book.”, so that I know I returned the book to the right library.
- Unsuccessful Return - As a customer, I would like to be notified if the book I am returning has not been added to this library by seeing the message, “That is not a valid book to return.”, so that I can return it to the correct library or fix my spelling error.

## Release 2 Requirements

- List Movies - As a customer, I would like to see a list of available movies, so that I can browse for a movie that I might check-out. Movies have a name, year, director and movie rating (from 1-10 or unrated).
- Check-out Movie - As a customer, I would like to check out a movie from the library, so I can enjoy it at home.
- User Accounts - Login - As a librarian, I want to know who has checked out a book, so that I can hold them accountable for returning it. Users must now login using their library number (which is in the format xxx-xxxx) and a password in order to check-out and return books. User credentials are predefined, so registering new users is not part of this story.
- User Accounts - User information - As a customer, I want to be able to see my user information (name, email address and phone number), so that I know that the library can contact me. This option should only be available when the customer is logged in and should only display that customer’s information.
