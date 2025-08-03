import React from "react";
import { ListWithKeys } from "./ListWithKeys";

const courses = [
  { code: "CS101", name: "Intro to Computer Science", duration: "8 weeks" },
  { code: "JS201", name: "Advanced JavaScript", duration: "6 weeks" },
  { code: "REACT301", name: "Fullstack React", duration: "10 weeks" },
];

export const CourseDetails = () => {
  return (
    <div className="section">
      <h2>Course Details</h2>
      <p>Available online courses:</p>
      <ListWithKeys
        items={courses}
        renderItem={(course) => (
          <div className="card">
            <h4>
              {course.code}: {course.name}
            </h4>
            <p>Duration: {course.duration}</p>
          </div>
        )}
        getKey={(course) => course.code}
      />
    </div>
  );
};
