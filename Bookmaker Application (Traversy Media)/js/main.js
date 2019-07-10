// Listen for form submit
document.getElementById('myForm').addEventListener('submit', saveBookmark);

// Save Bookmark
function saveBookmark(e) {

    // Get form values
    var siteName = document.getElementById('siteName').value;
    var siteURL = document.getElementById('siteURL').value;

    if(!validateForm(siteName, siteURL)){

        e.preventDefault();

        return false;
    }

    // Creating the object bookmark
    var bookmark = {
        name: siteName,
        url: siteURL
    }

    /*
    // Local Storage test (keeping data as string)
    localStorage.setItem('test', 'Hello, World');
    console.log(localStorage.getItem('test'));
    localStorage.removeItem('test');
    console.log(localStorage.getItem('test'));
    */

    // Test if bookmarks is null
    if (localStorage.getItem('bookmarks') === null) {
        // Init array
        var bookmarks = [];
        bookmarks.push(bookmark);

        // Set to local storage
        localStorage.setItem('bookmarks', JSON.stringify(bookmarks));
    }
    else {
        // Get bookmarks from local storage
        var bookmarks = JSON.parse(localStorage.getItem('bookmarks'));

        //Add bookmark to array
        bookmarks.push(bookmark);

        // Re-set to local storage
        localStorage.setItem('bookmarks', JSON.stringify(bookmarks));
    }

    // Clear form after submittion
    document.getElementById('myForm').reset();

    // Re-fetch bookmarks
    fetchBookmarks();

    // Prevent form from submitting
    e.preventDefault();
}

// Delete bookmark
function deleteBookmark(url){
    // Get bookmarks from local storage
    var bookmarks = JSON.parse(localStorage.getItem('bookmarks'));

    // Loop throught bookmarks
    for(var i=0; i<bookmarks.length; i++){

        if(bookmarks[i].url==url){
            //Remove from array
            bookmarks.splice(i, 1);
        }
    }
    // Re-set to local storage
    localStorage.setItem('bookmarks', JSON.stringify(bookmarks));

    // Re-fetch bookmarks
    fetchBookmarks();
}

// Fetch bookmarks
function fetchBookmarks() {
    // Get bookmarks from local storage
    var bookmarks = JSON.parse(localStorage.getItem('bookmarks'));
    // Get output id
    var bookmarksResult = document.getElementById('bookmarksResults');
    
    // Build output
    bookmarksResult.innerHTML = '';

    for(var i=0; i<bookmarks.length; i++){

        var name = bookmarks[i].name;
        var url = bookmarks[i].url;

        bookmarksResult.innerHTML += '<div style="margin-bottom: 10px;" class="card bg-light text-dark">'+
                                        '<div class="card-body">'+'<h3>'+name+'</h3>'+
                                            '<a class="btn btn-primary btn-sm" target="_blank" href="'+url+'"><i class="fa fa-external-link"></i> Visit</a>  '+
                                            '<a onclick="deleteBookmark(\''+url+'\')" class="btn btn-danger btn-sm" href="#"> <i class="fa fa-trash-o"></i> Delete</a>'+
                                        '</div>'+
                                     '</div>';
    }
}

function validateForm(siteName, siteURL){
    if(!siteName || !siteURL){
        // If none site or url was entered display message and stop method
        document.getElementById('fillFormMessage').style.display = "block";

        return false;
    }
    else{
        // Remove message from the form and continue execution
        document.getElementById('fillFormMessage').style.display = "none";
    }

    var expression = /[-a-zA-Z0-9@:%._\+~#=]{1,256}\.[a-zA-Z0-9()]{1,6}\b([-a-zA-Z0-9()@:%_\+.~#?&//=]*)?/gi;
    var regex = new RegExp(expression);

    if(!siteURL.match(regex)){
        // If URL is invalid display message and stop method
        document.getElementById('invalidURLMessage').style.display = "block";
       
        return false;
    }
    else{
        // Remove message from the form and continue execution
        document.getElementById('invalidURLMessage').style.display = "none";
    }

    return true;
}