<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>💌 Be my Valentine, Angelica? 💌</title>
  <!-- Google Font & Tailwind for quick layout -->
  <script src="https://cdn.tailwindcss.com"></script>
  <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@400;600;800&display=swap" rel="stylesheet">
  <!-- confetti library (lightweight) -->
  <script src="https://cdn.jsdelivr.net/npm/canvas-confetti@1.9.3/dist/confetti.browser.min.js"></script>
  <style>
    /* custom candy heart aesthetic */
    * {
      font-family: 'Quicksand', sans-serif;
    }
    body {
      background: linear-gradient(145deg, #ffdde1 0%, #f9c9d3 100%);
      min-height: 100vh;
      display: flex;
      align-items: center;
      justify-content: center;
      margin: 0;
      padding: 1rem;
      position: relative;
      overflow-x: hidden;
    }
    /* floating hearts background (pure CSS) */
    body::before {
      content: '';
      position: fixed;
      inset: 0;
      background: url('data:image/svg+xml;utf8,<svg width="40" height="40" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path d="M12 21.35l-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z" fill="%23ffb7c5" opacity="0.25"/></svg>') repeat;
      pointer-events: none;
      z-index: 0;
    }
    /* main card with glassmorphism */
    .valentine-card {
      background: rgba(255, 245, 248, 0.75);
      backdrop-filter: blur(12px);
      -webkit-backdrop-filter: blur(12px);
      border-radius: 3rem 1.5rem 3rem 1.5rem;
      box-shadow: 0 25px 50px -12px rgba(230, 70, 120, 0.4), inset 0 1px 2px rgba(255,255,255,0.8);
      border: 1px solid rgba(255,220,230,0.6);
      transition: all 0.3s ease;
      width: min(680px, 98%);
      z-index: 10;
      position: relative;
    }
    /* floating animation for images */
    @keyframes float-love {
      0% { transform: translateY(0px) rotate(0deg); }
      50% { transform: translateY(-8px) rotate(1deg); }
      100% { transform: translateY(0px) rotate(0deg); }
    }
    .float-img {
      animation: float-love 4s infinite ease-in-out;
      filter: drop-shadow(0 12px 10px #ffb6c190);
      border-radius: 30px;
      max-width: 260px;
      width: 100%;
      height: auto;
      border: 4px solid white;
      box-shadow: 0 15px 25px -8px #ff8da1;
    }
    /* custom button style */
    .candy-btn {
      transition: all 0.25s cubic-bezier(0.34, 1.56, 0.64, 1);
      box-shadow: 0 12px 22px -10px rgba(240, 80, 130, 0.5);
      font-weight: 700;
      letter-spacing: 0.5px;
      border: 2px solid rgba(255,255,255,0.7);
    }
    .candy-btn:hover {
      filter: brightness(1.05);
      transform: scale(1.08) translateY(-3px);
    }
    #noBtn {
      transition: left 0.2s ease, top 0.2s ease, transform 0.2s;
    }
    /* result section */
    .result-box {
      background: #fff0f2dd;
      border-radius: 2.5rem;
      padding: 1.8rem 1.2rem;
      border: 3px dashed #ff90a5;
    }
    /* hidden utility */
    .hidden {
      display: none !important;
    }
    /* responsive hint */
    .hint-text {
      background: #ffdae2;
      border-radius: 40px;
      padding: 0.5rem 1.2rem;
      display: inline-block;
      font-size: 0.95rem;
      font-weight: 600;
      color: #b5405a;
    }
    /* custom image container */
    .image-container {
      display: flex;
      justify-content: center;
      align-items: center;
      min-height: 240px;
      margin-bottom: 0.5rem;
    }
    .valentine-img {
      max-width: 260px;
      border-radius: 30px;
      box-shadow: 0 20px 30px -5px #faa0b5;
      border: 4px solid white;
      transition: transform 0.3s;
    }
    .valentine-img:hover {
      transform: scale(1.02);
    }
    /* front page image specific style */
    .front-page-img {
      border-radius: 40px 40px 40px 40px;
      border: 5px solid #ffe6ed;
      box-shadow: 0 25px 35px -8px #f4a0b5;
    }
  </style>
</head>
<body>
  <!-- fixed confetti canvas (invisible but catches confetti) -->
  <canvas id="confettiCanvas" style="position:fixed; top:0; left:0; width:100%; height:100%; pointer-events:none; z-index:9999;"></canvas>

  <!-- main interactive card -->
  <div class="valentine-card p-6 md:p-8 text-center">
    
    <!-- FRONT PAGE IMAGE - Your image from ImgBB -->
    <div class="image-container mb-3">
      <img src="https://i.ibb.co/DHk8RssN/IMG-1762.jpg" alt="Cute Valentine bear with heart" class="valentine-img front-page-img float-img">
    </div>

    <!-- CUSTOM IMAGE SECTION (hidden initially - this is the asking/success swap) -->
    <div class="image-container mb-2 hidden" id="swapImageContainer">
      <!-- State 1: Asking (Default) - cute begging cat -->
      <img id="askGif" class="valentine-img float-img" src="https://media.tenor.com/B435kM91N78AAAAi/mochi-cat.gif" alt="Cute begging cat">
      
      <!-- State 2: Success (Hidden initially) - Teddy bear hug GIF -->
      <img id="successGif" class="valentine-img float-img hidden" src="https://i.ibb.co/HTJSd6xv/IMG-1762.gif" alt="Teddy bear hug">
    </div>

    <!-- MAIN MESSAGE (personalized with name) -->
    <h1 id="mainQuestion" class="text-4xl md:text-5xl font-extrabold text-transparent bg-clip-text bg-gradient-to-r from-rose-700 to-pink-600 drop-shadow-lg mb-4">
      Angelica, will you be my Valentine? 💘
    </h1>

    <!-- INTERACTION ZONE: two buttons + hint -->
    <div id="buttonZone" class="relative w-full min-h-[130px] mt-6 mb-4">
      <!-- YES button (stays, but grows) -->
      <button id="yesBtn" class="candy-btn absolute left-[15%] top-1/2 -translate-y-1/2 bg-emerald-400 text-white text-xl py-3 px-7 rounded-full z-20 border-2 border-white">Yes! 🥰</button>
      
      <!-- NO button (runs away) -->
      <button id="noBtn" class="candy-btn absolute left-[65%] top-1/2 -translate-y-1/2 bg-rose-400 text-white text-xl py-3 px-7 rounded-full z-30 border-2 border-white">No ❤️</button>
    </div>

    <!-- HINT (dynamic based on interaction) -->
    <div id="hintMessage" class="hint-text mx-auto w-fit mt-2 mb-3">
      💬 The "No" button is a little shy...
    </div>

    <!-- SUCCESS SECTION (hidden at first) -->
    <div id="successSection" class="result-box hidden mt-4">
      <h2 class="text-5xl font-black text-pink-600 drop-shadow-md">YAY! 🎉💖</h2>
      <p class="text-xl font-semibold text-rose-800 mt-2">I knew it, Angelica! You're the sweetest.</p>
      <!-- Teddy bear hug GIF appears here too -->
      <img src="https://i.ibb.co/HTJSd6xv/IMG-1762.gif" alt="Teddy bear hug" class="rounded-3xl mx-auto mt-4 w-56 border-4 border-pink-200 shadow-xl">
      <p class="mt-3 text-rose-600 font-medium">🌸 a hug just for you! 🌸</p>
    </div>

    <!-- tiny footer (personal touch) -->
    <p class="text-xs text-rose-300 mt-5 italic">made with AI + lots of 💕 for Angelica</p>
  </div>

  <script>
    (function() {
      // ----- get elements -----
      const yesBtn = document.getElementById('yesBtn');
      const noBtn = document.getElementById('noBtn');
      const buttonZone = document.getElementById('buttonZone');
      const hintDiv = document.getElementById('hintMessage');
      const successDiv = document.getElementById('successSection');
      const mainQuestion = document.getElementById('mainQuestion');
      const askGif = document.getElementById('askGif');
      const successGif = document.getElementById('successGif');
      const swapImageContainer = document.getElementById('swapImageContainer');
      const frontPageContainer = document.querySelector('.front-page-img')?.closest('.image-container');

      // confetti canvas setup
      const confettiCanvas = document.getElementById('confettiCanvas');
      let confettiInstance = null;
      if (confettiCanvas) {
        confettiInstance = confetti.create(confettiCanvas, { resize: true, useWorker: true });
      }

      // state: yes button scale factor
      let yesScale = 1;
      const MAX_SCALE = 2.5;
      const GROW_STEP = 0.18;

      // no button runaway distance
      const RUNAWAY_DIST = 140; // pixels

      // personalized phrases when hovering/clicks near no (with Angelica inside)
      const teasingPhrases = [
        "No ❤️", "are you sure?", "really, Angelica?", "think again 🥺", "don't break my heart",
        "last chance!", "click Yes instead", "it's a trap!", "you'll miss me 💔",
        "have a heart 💕", "Angelica, please?", "be my valentine?", "I'll bring chocolate!",
        "say yes 🙈", "forever alone?", "that's cold ❄️", "but we're perfect!"
      ];
      let phraseIndex = 0;

      // helper: clamp value
      const clamp = (num, min, max) => Math.min(Math.max(num, min), max);

      // move No button away from pointer (and also from touch)
      function runAwayFromPointer(px, py) {
        if (!noBtn || !buttonZone) return;
        
        const zoneRect = buttonZone.getBoundingClientRect();
        const btnRect = noBtn.getBoundingClientRect();

        // if button is outside zone for some reason, reset inside
        let btnLeft = parseFloat(noBtn.style.left) || (zoneRect.width * 0.65);
        let btnTop = parseFloat(noBtn.style.top) || (zoneRect.height / 2 - btnRect.height/2);

        // current center of No button
        const btnCenterX = zoneRect.left + btnLeft + btnRect.width/2;
        const btnCenterY = zoneRect.top + btnTop + btnRect.height/2;

        // vector away from pointer (from button center to pointer)
        let dx = btnCenterX - px;
        let dy = btnCenterY - py;
        const distance = Math.hypot(dx, dy);

        if (distance < RUNAWAY_DIST) {
          // move away: normalize and push further
          if (distance < 5) { // exactly on button? move diagonally
            dx = 1; dy = 1;
          } else {
            dx = dx / distance;
            dy = dy / distance;
          }
          const push = 150; // strong shift
          let newLeft = btnLeft + dx * push;
          let newTop = btnTop + dy * push;

          // keep within zone boundaries
          newLeft = clamp(newLeft, 0, zoneRect.width - btnRect.width);
          newTop = clamp(newTop, 0, zoneRect.height - btnRect.height);

          noBtn.style.left = newLeft + 'px';
          noBtn.style.top = newTop + 'px';
          noBtn.style.transform = 'none'; // remove any translate override

          // GROW the YES button! (+ change hint)
          yesScale = Math.min(MAX_SCALE, yesScale + GROW_STEP);
          yesBtn.style.transform = `translateY(-50%) scale(${yesScale})`;

          // update hint and cycle phrase
          phraseIndex = (phraseIndex + 1) % teasingPhrases.length;
          noBtn.textContent = teasingPhrases[phraseIndex];
          hintDiv.innerHTML = `😈 Angelica, the button ran! 💬`; 
        }
      }

      // pointer move (mouse + touch)
      buttonZone.addEventListener('pointermove', (e) => {
        runAwayFromPointer(e.clientX, e.clientY);
      });

      // also when No button is tapped, it moves + grows Yes
      noBtn.addEventListener('click', (e) => {
        e.preventDefault(); // stop any accident
        // move it drastically on click as well
        if (buttonZone) {
          const zoneRect = buttonZone.getBoundingClientRect();
          const btnRect = noBtn.getBoundingClientRect();
          // random position in zone
          const newLeft = Math.random() * (zoneRect.width - btnRect.width);
          const newTop = Math.random() * (zoneRect.height - btnRect.height);
          noBtn.style.left = newLeft + 'px';
          noBtn.style.top = newTop + 'px';

          // grow yes
          yesScale = Math.min(MAX_SCALE, yesScale + GROW_STEP * 1.5);
          yesBtn.style.transform = `translateY(-50%) scale(${yesScale})`;
          
          // cycle phrase
          phraseIndex = (phraseIndex + 2) % teasingPhrases.length;
          noBtn.textContent = teasingPhrases[phraseIndex];
          hintDiv.innerHTML = `🥹 Angelica, stop that! Say yes 💞`;
        }
      });

      // touch / drag mobile support: add touchmove
      buttonZone.addEventListener('touchmove', (e) => {
        e.preventDefault();
        const touch = e.touches[0];
        if (touch) runAwayFromPointer(touch.clientX, touch.clientY);
      }, { passive: false });

      // ---- YES button logic ----
      yesBtn.addEventListener('click', () => {
        // Hide the front page image container
        if (frontPageContainer) {
          frontPageContainer.classList.add('hidden');
        }
        
        // Show the swap image container (with cat and bear gif)
        swapImageContainer.classList.remove('hidden');
        
        // SWAP IMAGES: hide asking cat, show your teddy bear hug
        askGif.classList.add('hidden');
        successGif.classList.remove('hidden');
        
        // hide zone + hint
        buttonZone.style.display = 'none';
        hintDiv.classList.add('hidden');
        // show success
        successDiv.classList.remove('hidden');
        // optionally change question text
        mainQuestion.textContent = '💕 YES! You made my day, Angelica! 💕';
        mainQuestion.classList.add('text-pink-500');

        // full confetti extravaganza
        if (confettiInstance) {
          confettiInstance({ particleCount: 150, spread: 100, origin: { y: 0.6 } });
          confettiInstance({ particleCount: 100, spread: 70, origin: { y: 0.5, x: 0.2 }, colors: ['#ff8fab', '#fb6f92', '#ffb3c6'] });
          confettiInstance({ particleCount: 100, spread: 70, origin: { y: 0.5, x: 0.8 }, colors: ['#c9184a', '#ff4d6d', '#ffb3c6'] });
          setTimeout(() => {
            confettiInstance({ particleCount: 300, spread: 120, origin: { y: 0.4 } });
          }, 250);
        } else {
          // fallback basic confetti
          confetti({ particleCount: 300, spread: 100, origin: { y: 0.5 } });
        }
      });

      // ---- reset initial positions ----
      function resetButtonPositions() {
        if (!buttonZone || !noBtn || !yesBtn) return;
        const zoneW = buttonZone.offsetWidth;
        const zoneH = buttonZone.offsetHeight;
        // approximate positions based on percentages
        noBtn.style.left = '65%';
        noBtn.style.top = '50%';
        noBtn.style.transform = 'translateY(-50%)';
        yesBtn.style.left = '15%';
        yesBtn.style.top = '50%';
        yesBtn.style.transform = 'translateY(-50%) scale(1)';
        yesScale = 1;
        // restore button text
        noBtn.textContent = 'No ❤️';
        hintDiv.innerHTML = '💬 The "No" button is a little shy...';
        hintDiv.classList.remove('hidden');
      }

      // ensure on window resize and load we keep relative positions
      window.addEventListener('resize', () => {
        // preserve relative percentages but keep within
        if (buttonZone && !successDiv.classList.contains('hidden')) return; // if success visible ignore
        resetButtonPositions();
      });

      // initial call after tiny delay (layout)
      setTimeout(resetButtonPositions, 20);

      // if success appears, no need to move

      // additionally, if they hover directly on No button (mouse enter) - force move
      noBtn.addEventListener('mouseenter', (e) => {
        // simulate pointer move from button center + offset
        const btnRect = noBtn.getBoundingClientRect();
        runAwayFromPointer(btnRect.left + btnRect.width/2 + 10, btnRect.top + btnRect.height/2 + 10);
      });

      // prevent default on no button context menu
      noBtn.addEventListener('contextmenu', (e) => e.preventDefault());

      // reflection (as comment after html)
    })();
  </script>
  <!-- 
    Reflection:
    1. What AI tool did I use?
       I used ChatGPT to help me code this Valentine card. I also used ImgBB to host my images.

    2. How did it help me?
       I'm not gonna lie, I'm not the best at JavaScript so the AI helped me figure out how to make the "No" button run away from the cursor. I also asked it how to add confetti and make the images swap when someone clicks Yes. It gave me the code structure and I just customized it.

    3. What did I modify or improve?
       I changed the name to Angelica because that's my crush hehe. I also uploaded two images to ImgBB - one for the front page (the bear with heart) and one GIF for when she says yes (the teddy bear hug). I made the buttons say "Yes! 🥰" and "No ❤️" instead of the default ones. I also fixed that blank space issue because there was some timestamp showing and I removed it. The colors are pinkish because Valentine's day vibes.

    4. What did I learn from this activity?
       I learned how to host images on ImgBB and put them in my code. I also learned a bit about how JavaScript can make things interactive like moving buttons and popping confetti. It was cool to see how a few lines of code can make a simple webpage fun. I also learned that AI is helpful but you still need to understand what you're doing so you can change the names and images properly.
  -->
</body>
</html>