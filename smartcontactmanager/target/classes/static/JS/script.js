console.log("this is script file");



const toggleSidebar = () => {
    const sidebar = document.querySelector('.sidebar');
    const content = document.querySelector('.content');
    
    // Check if sidebar has the 'active' class
    if (sidebar.classList.contains('active')) {
        // Hide sidebar and adjust content margin
        sidebar.classList.remove('active');
        content.style.marginLeft = '20%'; // Adjust the content margin when sidebar is closed
    } else {
        // Show sidebar and adjust content margin
        sidebar.classList.add('active');
        content.style.marginLeft = '0%'; // Adjust the content margin when sidebar is open
    }
};


