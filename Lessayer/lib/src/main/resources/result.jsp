<%@ page import="java.util.*" %>

<html>
<head>
    <title>Hello World</title>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- FontAwesome CSS -->
    <link rel="stylesheet" href="css/font-awesome.min.css">

    <!-- ElegantFonts CSS -->
    <link rel="stylesheet" href="css/elegant-fonts.css">

    <!-- themify-icons CSS -->
    <link rel="stylesheet" href="css/themify-icons.css">

    <!-- Swiper CSS -->
    <link rel="stylesheet" href="css/swiper.min.css">

    <!-- Styles -->
    <link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="hero-content-overlay">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="hero-content-wrap flex flex-column justify-content-center align-items-start">
                            <header class="entry-header">
                                <h4>Essayez le mieux web pour etudier le français</h4>
                                <h1>le mieux web pour<br/>Etuder le français</h1>
                            </header><!-- .entry-header -->

                            <div class="entry-content">
                                <%
									List styles = (List) request.getAttribute("styles");
									Iterator it = styles.iterator();
									while(it.hasNext()) {
										out.print("<br>try: " + it.next());
									}
								%>
                            </div><!-- .entry-content -->

                            <footer class="entry-footer read-more">
                                <a href="form.html">lire plus</a>
                            </footer><!-- .entry-footer -->
                        </div><!-- .hero-content-wrap -->
                    </div><!-- .col -->
                </div><!-- .row -->
            </div><!-- .container -->
        </div><!-- .hero-content-hero-content-overlay -->
    </div><!-- .hero-content -->
    
	<h1 align="center">Beer Recommendations JSP</h1>
	<p>
	
	<%
		styles = (List) request.getAttribute("styles");
		it = styles.iterator();
		while(it.hasNext()) {
			out.print("<br>try: " + it.next());
		}
	%>

</body>
</html>
