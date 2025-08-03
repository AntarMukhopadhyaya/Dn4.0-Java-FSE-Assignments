import React, { useState } from "react";
import "./App.css";
import { BookDetails } from "./BookDetails";
import { BlogDetails } from "./BlogDetail";
import { CourseDetails } from "./CourseDetail";

function App() {
  // control which components are shown
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  // element variable example
  const header = <h1>Blogger App: Resources & Reviews</h1>;

  // conditional component selection via object/switch-style
  const allActive = showBooks && showBlogs && showCourses;

  return (
    <div className="App">
      {header}

      <div className="toggles">
        <label>
          <input
            type="checkbox"
            checked={showBooks}
            onChange={() => setShowBooks((v) => !v)}
          />{" "}
          Show Books
        </label>
        <label>
          <input
            type="checkbox"
            checked={showBlogs}
            onChange={() => setShowBlogs((v) => !v)}
          />{" "}
          Show Blogs
        </label>
        <label>
          <input
            type="checkbox"
            checked={showCourses}
            onChange={() => setShowCourses((v) => !v)}
          />{" "}
          Show Courses
        </label>
      </div>

      {/* Conditional rendering examples */}
      {/* 1. Ternary: show a message if none selected */}
      {!showBooks && !showBlogs && !showCourses ? (
        <p className="info">
          No sections enabled. Toggle a checkbox to display content.
        </p>
      ) : null}

      {/* 2. Logical &&: render when each flag is true */}
      {showBooks && <BookDetails />}

      {/* 3. Inline conditional via function (simulating switch) */}
      {showBlogs ? <BlogDetails /> : null}

      {/* 4. Short-circuit with && */}
      {showCourses && <CourseDetails />}

      {/* 5. Another style: if allActive show a summary banner */}
      {allActive && (
        <div className="banner">
          <strong>All sections visible:</strong> Books, Blogs & Courses.
        </div>
      )}
    </div>
  );
}

export default App;
