<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Class Schedule | HTML Roadmap Integration</title>
    <style>
        /* Basic styling for clarity - using roadmap concepts */
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }
        
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            line-height: 1.6;
            color: #333;
            background-color: #f8f9fa;
            padding: 20px;
            max-width: 1200px;
            margin: 0 auto;
        }
        
        .container {
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            overflow: hidden;
        }
        
        header {
            background-color: #2c3e50;
            color: white;
            padding: 25px;
            text-align: center;
        }
        
        header h1 {
            margin-bottom: 10px;
            font-size: 2.2rem;
        }
        
        header p {
            font-size: 1.1rem;
            opacity: 0.9;
        }
        
        main {
            padding: 30px;
        }
        
        .section-title {
            color: #2c3e50;
            border-bottom: 2px solid #3498db;
            padding-bottom: 10px;
            margin: 30px 0 20px 0;
            font-size: 1.5rem;
        }
        
        /* Table styling following roadmap concepts */
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.05);
        }
        
        caption {
            caption-side: top;
            font-size: 1.2rem;
            font-weight: bold;
            margin-bottom: 15px;
            color: #2c3e50;
            text-align: left;
        }
        
        thead {
            background-color: #34495e;
            color: white;
        }
        
        th, td {
            padding: 15px;
            text-align: left;
            border: 1px solid #ddd;
            vertical-align: top;
        }
        
        th {
            font-weight: 600;
            text-transform: uppercase;
            font-size: 0.9rem;
            letter-spacing: 0.5px;
        }
        
        tbody tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        
        tbody tr:hover {
            background-color: #f1f8ff;
            transition: background-color 0.2s ease;
        }
        
        /* Textual tags examples from roadmap */
        .class-code {
            font-weight: bold;
            color: #2c3e50;
        }
        
        .lec {
            color: #2980b9;
            font-size: 0.9em;
        }
        
        .lab {
            color: #27ae60;
            font-size: 0.9em;
        }
        
        .day {
            font-weight: bold;
            color: #e74c3c;
        }
        
        .time {
            color: #8e44ad;
            font-weight: 500;
        }
        
        .room {
            color: #d35400;
        }
        
        /* Additional roadmap concepts */
        .roadmap-reference {
            background-color: #f8f9fa;
            border-left: 4px solid #3498db;
            padding: 15px;
            margin: 20px 0;
            border-radius: 0 4px 4px 0;
        }
        
        .roadmap-reference h3 {
            color: #2c3e50;
            margin-bottom: 10px;
        }
        
        .roadmap-reference ul {
            padding-left: 20px;
        }
        
        .roadmap-reference li {
            margin-bottom: 8px;
        }
        
        footer {
            background-color: #2c3e50;
            color: white;
            text-align: center;
            padding: 20px;
            margin-top: 30px;
            font-size: 0.9rem;
        }
        
        /* Responsive design */
        @media (max-width: 768px) {
            th, td {
                padding: 10px;
                font-size: 0.9rem;
            }
            
            main {
                padding: 15px;
            }
        }
        
        /* Using semantic markup classes */
        .important {
            background-color: #fffde7;
            border: 1px solid #ffd54f;
            padding: 10px;
            border-radius: 4px;
            margin: 15px 0;
        }
        
        .note {
            font-style: italic;
            color: #7f8c8d;
        }
        
        .highlight {
            background-color: #e3f2fd;
            padding: 2px 5px;
            border-radius: 3px;
        }
    </style>
</head>
<body>
    <div class="container">
        <!-- Header with semantic markup -->
        <header>
            <h1 id="main-title">My Weekly Class Schedule</h1>
            <p><small>Second Semester, AY 2025-2026</small></p>
        </header>
        
        <main>
            <!-- Introduction section -->
            <section>
                <h2 class="section-title">About This Schedule</h2>
                
                <div class="important">
                    <p><strong>Note:</strong> This implementation uses concepts from the HTML roadmap including <span class="highlight">semantic markup</span>, <span class="highlight">table structure</span>, <span class="highlight">textual tags</span>, and <span class="highlight">basic styling</span>.</p>
                </div>
            </section>
            
            <!-- Main schedule table -->
            <section>
                <h2 class="section-title">Class Schedule Table</h2>
                
                <table border="1">
                    <caption>Weekly Class Schedule - Following HTML Roadmap Best Practices</caption>
                    <thead>
                        <tr>
                            <th>Class Code & Name</th>
                            <th>Schedule Details</th>
                            <th>Type</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <span class="class-code">CC 15-A</span> - Computer Concepts 15
                                <br><span class="note">Section A</span>
                            </td>
                            <td>
                                <span class="day">Monday</span>: 
                                <span class="time">3:00PM - 5:00PM</span> at 
                                <span class="room">FH 104</span>
                            </td>
                            <td><span class="lec">LEC</span></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="class-code">CC 15-LA</span> - Computer Concepts 15 Lab
                                <br><span class="note">Lab Section A</span>
                            </td>
                            <td>
                                <span class="day">Monday</span>: 
                                <span class="time">7:30AM - 10:30AM</span> at 
                                <span class="room">FH 306 (Lab D) CCS</span>
                            </td>
                            <td><span class="lab">LAB</span></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="class-code">FL 2.5-LXA</span> - Foreign Language 2.5 Lab
                                <br><span class="note">Spanish Conversation</span>
                            </td>
                            <td>
                                <span class="day">Thursday</span>: 
                                <span class="time">12:00PM - 1:30PM</span> at 
                                <span class="room">Speech Lab 2</span>
                            </td>
                            <td><span class="lab">LAB</span></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="class-code">FL 2.5-XA</span> - Foreign Language 2.5
                                <br><span class="note">Spanish Grammar</span>
                            </td>
                            <td>
                                <span class="day">Monday</span>: 
                                <span class="time">12:00PM - 1:30PM</span> at 
                                <span class="room">SBM 304</span>
                            </td>
                            <td><span class="lec">LEC</span></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="class-code">HIST 3-YC</span> - History 3
                                <br><span class="note">World History</span>
                            </td>
                            <td>
                                <span class="day">Monday & Thursday</span>: 
                                <span class="time">1:30PM - 3:00PM</span> at 
                                <span class="room">CH 211</span>
                            </td>
                            <td><span class="lec">LEC</span></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="class-code">ITCC 11.1-C</span> - IT Concepts 11.1
                                <br><span class="note">Web Fundamentals</span>
                            </td>
                            <td>
                                <span class="day">Tuesday</span>: 
                                <span class="time">1:00PM - 3:00PM</span> at 
                                <span class="room">FH 203</span>
                            </td>
                            <td><span class="lec">LEC</span></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="class-code">ITCC 11.1-LC</span> - IT Concepts 11.1 Lab
                                <br><span class="note">Web Development Lab</span>
                            </td>
                            <td>
                                <span class="day">Tuesday</span>: 
                                <span class="time">3:00PM - 6:00PM</span> at 
                                <span class="room">FH 403 (Lab E) CCS</span>
                            </td>
                            <td><span class="lab">LAB</span></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="class-code">ITCC 13.1-C</span> - IT Concepts 13.1
                                <br><span class="note">Database Management</span>
                            </td>
                            <td>
                                <span class="day">Friday</span>: 
                                <span class="time">3:00PM - 5:00PM</span> at 
                                <span class="room">FH 206</span>
                            </td>
                            <td><span class="lec">LEC</span></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="class-code">ITCC 13.1-LC</span> - IT Concepts 13.1 Lab
                                <br><span class="note">Database Lab</span>
                            </td>
                            <td>
                                <span class="day">Saturday</span>: 
                                <span class="time">9:00AM - 12:00PM</span> at 
                                <span class="room">FH 304 (Lab C) CCS</span>
                            </td>
                            <td><span class="lab">LAB</span></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="class-code">PHILO 23-XB</span> - Philosophy 23
                                <br><span class="note">Ethics</span>
                            </td>
                            <td>
                                <span class="day">Monday & Thursday</span>: 
                                <span class="time">10:30AM - 12:00PM</span> at 
                                <span class="room">A 307</span>
                            </td>
                            <td><span class="lec">LEC</span></td>
                        </tr>
                    </tbody>
                </table>
                
                <div class="note" style="margin-top: 10px;">
                    <p><strong>Total:</strong> 10 classes (5 Lectures, 5 Laboratories) | <strong>Class Days:</strong> Monday, Tuesday, Thursday, Friday, Saturday</p>
                </div>
            </section>
            
            <!-- HTML Roadmap Integration Section -->
            <section>
                <h2 class="section-title">HTML Roadmap Concepts Applied</h2>
                
                <div class="roadmap-reference">
                    <h3>HTML Table Concepts from Roadmap:</h3>
                    <ul>
                        <li><strong>Table Tag</strong>: Used <code>&lt;table&gt;</code> with proper structure including <code>&lt;thead&gt;</code>, <code>&lt;tbody&gt;</code>, and <code>&lt;caption&gt;</code></li>
                        <li><strong>Table Structure</strong>: Implemented <code>&lt;tr&gt;</code> (table rows), <code>&lt;th&gt;</code> (table headers), and <code>&lt;td&gt;</code> (table data)</li>
                        <li><strong>Semantic Markup</strong>: Used <code>&lt;header&gt;</code>, <code>&lt;main&gt;</code>, <code>&lt;section&gt;</code>, <code>&lt;footer&gt;</code> for better document structure</li>
                        <li><strong>Textual Tags</strong>: Applied <code>&lt;strong&gt;</code>, <code>&lt;small&gt;</code>, <code>&lt;span&gt;</code> with classes for styling</li>
                        <li><strong>Basic Tags</strong>: Proper use of <code>&lt;h1&gt;</code> to <code>&lt;h3&gt;</code>, <code>&lt;p&gt;</code>, <code>&lt;div&gt;</code></li>
                    </ul>
                </div>
                
                <div class="roadmap-reference">

                    </ul>
                </div>
            </section>
            
            <!-- Schedule summary using lists from roadmap -->
            <section>
                <h2 class="section-title">Schedule Summary</h2>
                
                <div style="display: flex; flex-wrap: wrap; gap: 20px;">
                    <div style="flex: 1; min-width: 250px;">
                        <h3>Classes by Day:</h3>
                        <ul>
                            <li><strong>Monday (5 classes):</strong> CC 15-A, CC 15-LA, FL 2.5-XA, HIST 3-YC, PHILO 23-XB</li>
                            <li><strong>Tuesday (2 classes):</strong> ITCC 11.1-C, ITCC 11.1-LC</li>
                            <li><strong>Thursday (3 classes):</strong> FL 2.5-LXA, HIST 3-YC, PHILO 23-XB</li>
                            <li><strong>Friday (1 class):</strong> ITCC 13.1-C</li>
                            <li><strong>Saturday (1 class):</strong> ITCC 13.1-LC</li>
                        </ul>
                    </div>
                    
                    <div style="flex: 1; min-width: 250px;">
                        <h3>Class Types:</h3>
                        <ol>
                            <li><span class="lec">Lecture Classes (5)</span>: Regular classroom instruction</li>
                            <li><span class="lab">Laboratory Classes (5)</span>: Hands-on practical sessions
                       

                    </div>
                </div>
            </section>
        </main>
        
        <!-- Footer with semantic markup -->
        <footer>
            <p>Created for <strong>Web Systems and Technologies</strong> - HTML Tables Activity</p>
            <p>References: <a href="https://roadmap.sh/html" style="color: #3498db;">HTML Roadmap</a> | SLMIS Class Schedule</p>
            <p><small>This page demonstrates proper HTML structure, table implementation, and roadmap concepts</small></p>
        </footer>
    </div>
    
    <!-- Minimal JavaScript for demonstration -->
    <script>
        // Simple JavaScript to demonstrate roadmap concept
        document.addEventListener('DOMContentLoaded', function() {
            console.log('Class schedule table loaded successfully!');
            
            // Add click event to table rows for interactivity
            const tableRows = document.querySelectorAll('tbody tr');
            tableRows.forEach(row => {
                row.addEventListener('click', function() {
                    this.style.backgroundColor = '#e8f4fc';
                    setTimeout(() => {
                        this.style.backgroundColor = '';
                    }, 500);
                });
            });
        });
    </script>
</body>
</html>